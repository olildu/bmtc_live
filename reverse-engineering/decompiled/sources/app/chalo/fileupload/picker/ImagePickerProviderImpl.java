package app.chalo.fileupload.picker;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/fileupload/picker/ImagePickerProviderImpl;", "Lapp/chalo/fileupload/picker/ImagePickerSetter;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImagePickerProviderImpl implements ImagePickerSetter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Lazy f2787a;

    @Override // app.chalo.fileupload.picker.ImagePickerSetter
    public final void a(Lazy imagePicker) {
        Intrinsics.i(imagePicker, "imagePicker");
        this.f2787a = imagePicker;
    }

    @Override // app.chalo.fileupload.picker.ImagePickerSetter
    public final void b() {
        this.f2787a = null;
    }

    @Override // app.chalo.fileupload.picker.ImagePickerProvider
    public final ImagePicker c() {
        Lazy lazy = this.f2787a;
        if (lazy != null) {
            return (ImagePicker) lazy.getValue();
        }
        return null;
    }
}
