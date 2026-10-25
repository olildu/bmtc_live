package app.chalo.fileupload.picker;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/fileupload/picker/ImagePickerResult;", "", "PickerClosed", "ImagePicked", "PickerError", "Lapp/chalo/fileupload/picker/ImagePickerResult$ImagePicked;", "Lapp/chalo/fileupload/picker/ImagePickerResult$PickerClosed;", "Lapp/chalo/fileupload/picker/ImagePickerResult$PickerError;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ImagePickerResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/fileupload/picker/ImagePickerResult$ImagePicked;", "Lapp/chalo/fileupload/picker/ImagePickerResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImagePicked extends ImagePickerResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BitmapImage f2788a;

        public ImagePicked(BitmapImage bitmapImage) {
            this.f2788a = bitmapImage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ImagePicked) && Intrinsics.d(this.f2788a, ((ImagePicked) obj).f2788a);
        }

        public final int hashCode() {
            return this.f2788a.hashCode();
        }

        public final String toString() {
            return "ImagePicked(image=" + this.f2788a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/fileupload/picker/ImagePickerResult$PickerClosed;", "Lapp/chalo/fileupload/picker/ImagePickerResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PickerClosed extends ImagePickerResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PickerClosed f2789a = new PickerClosed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PickerClosed);
        }

        public final int hashCode() {
            return -1024743027;
        }

        public final String toString() {
            return "PickerClosed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/fileupload/picker/ImagePickerResult$PickerError;", "Lapp/chalo/fileupload/picker/ImagePickerResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PickerError extends ImagePickerResult {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PickerError);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PickerError(msg=null)";
        }
    }
}
