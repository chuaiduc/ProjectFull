var CLOUDINARY_URL = 'https://api.cloudinary.com/v1_1/aurora-beauty-company/upload';
var CLOUDINARY_UPLOAD_PRESET = 'k9tp97eo';

var imgPreview = document.getElementById('img-preview');
var fileUpload = document.getElementById('file-upload');
var formData1=new FormData();
fileUpload.addEventListener('change', function (event) {
    console.log(event);
    var file = event.target.files[0];

   
    formData1.append('file', file);
    formData1.append('upload_preset', CLOUDINARY_UPLOAD_PRESET);
    
    axios({
        url: CLOUDINARY_URL,
        method: 'POST',
        headers: {
            'Content-Type': 'application/multipart/form-data'
        },
        data: formData1

    }).then(function (res) {
        console.log(res);
        console.log(res.data.url);
        imgPreview.src = res.data.secure_url;
    }).catch(function (err) {
        console.log(err);
    });
    console.log(event);
});
