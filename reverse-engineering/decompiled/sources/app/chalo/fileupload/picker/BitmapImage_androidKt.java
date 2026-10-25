package app.chalo.fileupload.picker;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BitmapImage_androidKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(Bitmap bitmap, ContinuationImpl continuationImpl) throws Throwable {
        BitmapImage_androidKt$toByteArray$1 bitmapImage_androidKt$toByteArray$1;
        if (continuationImpl instanceof BitmapImage_androidKt$toByteArray$1) {
            bitmapImage_androidKt$toByteArray$1 = (BitmapImage_androidKt$toByteArray$1) continuationImpl;
            int i = bitmapImage_androidKt$toByteArray$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bitmapImage_androidKt$toByteArray$1.label = i - Integer.MIN_VALUE;
            } else {
                bitmapImage_androidKt$toByteArray$1 = new BitmapImage_androidKt$toByteArray$1(continuationImpl);
            }
        } else {
            bitmapImage_androidKt$toByteArray$1 = new BitmapImage_androidKt$toByteArray$1(continuationImpl);
        }
        Object objG = bitmapImage_androidKt$toByteArray$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bitmapImage_androidKt$toByteArray$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            DefaultScheduler defaultScheduler = Dispatchers.f17721a;
            BitmapImage_androidKt$toByteArray$2 bitmapImage_androidKt$toByteArray$2 = new BitmapImage_androidKt$toByteArray$2(bitmap, null);
            bitmapImage_androidKt$toByteArray$1.label = 1;
            objG = BuildersKt.g(defaultScheduler, bitmapImage_androidKt$toByteArray$2, bitmapImage_androidKt$toByteArray$1);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objG);
        }
        Intrinsics.h(objG, "withContext(...)");
        return objG;
    }
}
