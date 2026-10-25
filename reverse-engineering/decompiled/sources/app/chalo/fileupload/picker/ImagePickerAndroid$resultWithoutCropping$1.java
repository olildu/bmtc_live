package app.chalo.fileupload.picker;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.fileupload.picker.ImagePickerAndroid", f = "ImagePicker.android.kt", l = {156}, m = "resultWithoutCropping", v = 1)
final class ImagePickerAndroid$resultWithoutCropping$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ImagePickerAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickerAndroid$resultWithoutCropping$1(ImagePickerAndroid imagePickerAndroid, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = imagePickerAndroid;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ImagePickerAndroid$resultWithoutCropping$1 imagePickerAndroid$resultWithoutCropping$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ImagePickerAndroid imagePickerAndroid = this.this$0;
        imagePickerAndroid.getClass();
        if (this instanceof ImagePickerAndroid$resultWithoutCropping$1) {
            int i = this.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                this.label = i - Integer.MIN_VALUE;
                imagePickerAndroid$resultWithoutCropping$1 = this;
            } else {
                imagePickerAndroid$resultWithoutCropping$1 = new ImagePickerAndroid$resultWithoutCropping$1(imagePickerAndroid, this);
            }
        } else {
            imagePickerAndroid$resultWithoutCropping$1 = new ImagePickerAndroid$resultWithoutCropping$1(imagePickerAndroid, this);
        }
        Object objA = imagePickerAndroid$resultWithoutCropping$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = imagePickerAndroid$resultWithoutCropping$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            AppCompatActivity appCompatActivity = imagePickerAndroid.f2783a;
            imagePickerAndroid$resultWithoutCropping$1.label = 1;
            objA = BitmapImage.b.a(null, appCompatActivity, imagePickerAndroid$resultWithoutCropping$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        BitmapImage bitmapImage = (BitmapImage) objA;
        return bitmapImage != null ? new ImagePickerResult.ImagePicked(bitmapImage) : new ImagePickerResult.PickerError();
    }
}
