// The directory path where configuration files for different modules of the Codeline framework are stored.
// By default, this is set to "config/", meaning it will look for configuration files inside the "config" folder
// located at the root of the project. Each module (e.g., auth, data, ui) will have its own configuration file
// within this directory (e.g., "config/auth_config.json", "config/data_config.json").
//
// Users can change this path to point to a different directory if they wish to organize their configuration
// files differently. For instance, if you want to store your configuration files in a folder named "custom-config"
// instead, you can simply uncomment the following line and change the directory name:
//
// val configDirectory: String = "custom-config/"
//
// This allows for greater flexibility and customization, enabling users to organize their project structure
// according to their preferences or specific project requirements.

val configDirectory: String = "config/"
