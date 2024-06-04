// Function to validate the form inputs
function validate() {
    // Get references to input elements and checkboxes
    const emailInput = document.getElementById('email');
    const loginInput = document.getElementById('login');
    const passwordInput = document.getElementById('pass');
    const passwordInput2 = document.getElementById('pass2');
    const newsletterCheckbox = document.getElementById('newsletter');
    const termsCheckbox = document.getElementById('terms');

    // Variable to track overall validity of the form
    let isValid = true;

    // Check email validity
    if (!isValidEmail(emailInput.value)) {
        displayErrorMessage(emailInput, 'Please enter a valid email address.');
        isValid = false;
    } else {
        hideErrorMessage(emailInput);
    }

    // Check username length
    if (loginInput.value.length < 1 || loginInput.value.length >= 20) {
        displayErrorMessage(loginInput, 'User name should be non-empty and less than 20 characters long.');
        isValid = false;
    } else {
        hideErrorMessage(loginInput);
    }

    // Check password length
    if (passwordInput.value.length < 6) {
        displayErrorMessage(passwordInput, 'Password should be at least 6 characters long.');
        isValid = false;
    } else {
        hideErrorMessage(passwordInput);
    }

    // Check password complexity
    if (!/(?=.*[a-z])(?=.*[A-Z]).{6,}/.test(passwordInput.value)) {
        displayErrorMessage(passwordInput, 'Password should be at least 6 characters: 1 uppercase and 1 lowercase letter.');
        isValid = false;
    } else {
        hideErrorMessage(passwordInput);
    }

    // Check if password and retype password match
    if (passwordInput2.value !== passwordInput.value) {
        displayErrorMessage(passwordInput2, 'Passwords do not match.');
        isValid = false;
    } else if (passwordInput2.value === '') {
        displayErrorMessage(passwordInput2, 'Please retype the password.');
        isValid = false;
    } else {
        hideErrorMessage(passwordInput2);
    }

    // Check if terms checkbox is checked
    if (!termsCheckbox.checked) {
        displayErrorMessage(termsCheckbox.parentElement, 'Please agree to the terms and conditions.');
        isValid = false;
    } else {
        hideErrorMessage(termsCheckbox.parentElement);
    }

    // Return the overall validity of the form
    return isValid;
}

// Function to validate email format using regex
function isValidEmail(email) {
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return emailRegex.test(email);
}

// Function to display error message for an input element
function displayErrorMessage(inputElement, message) {
    const errorMessageElement = inputElement.nextElementSibling;
    const errorMessageText = 'X ' + message; // Prepend 'X' to the error message
    
    // Check if error message element already exists
    if (errorMessageElement && errorMessageElement.className === 'error-message') {
        errorMessageElement.textContent = errorMessageText;
    } else {
        // Create new error message element
        const newErrorMessageElement = document.createElement('div');
        newErrorMessageElement.className = 'error-message';
        newErrorMessageElement.textContent = errorMessageText;
        inputElement.parentNode.insertBefore(newErrorMessageElement, inputElement.nextElementSibling);
    }
    // Add error class to input element for styling
    inputElement.classList.add('error');
}

// Function to hide error message for an input element
function hideErrorMessage(inputElement) {
    const errorMessageElement = inputElement.nextElementSibling;
    // Check if error message element exists
    if (errorMessageElement && errorMessageElement.className === 'error-message') {
        // Remove error message element
        errorMessageElement.parentNode.removeChild(errorMessageElement);
        // Remove error class from input element
        inputElement.classList.remove('error');
    }
}
