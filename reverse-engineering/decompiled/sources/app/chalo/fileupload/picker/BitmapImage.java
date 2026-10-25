package app.chalo.fileupload.picker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/fileupload/picker/BitmapImage;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BitmapImage {
    public static final Companion b = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f2782a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/fileupload/picker/BitmapImage$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(Uri uri, Context context, ContinuationImpl continuationImpl) throws Throwable {
            BitmapImage$Companion$fromUriContent$1 bitmapImage$Companion$fromUriContent$1;
            Bitmap bitmapDecodeBitmap;
            if (continuationImpl instanceof BitmapImage$Companion$fromUriContent$1) {
                bitmapImage$Companion$fromUriContent$1 = (BitmapImage$Companion$fromUriContent$1) continuationImpl;
                int i = bitmapImage$Companion$fromUriContent$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    bitmapImage$Companion$fromUriContent$1.label = i - Integer.MIN_VALUE;
                } else {
                    bitmapImage$Companion$fromUriContent$1 = new BitmapImage$Companion$fromUriContent$1(this, continuationImpl);
                }
            } else {
                bitmapImage$Companion$fromUriContent$1 = new BitmapImage$Companion$fromUriContent$1(this, continuationImpl);
            }
            Object objA = bitmapImage$Companion$fromUriContent$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = bitmapImage$Companion$fromUriContent$1.label;
            if (i2 == 0) {
                ResultKt.b(objA);
                try {
                    bitmapDecodeBitmap = Build.VERSION.SDK_INT >= 28 ? ImageDecoder.decodeBitmap(ImageDecoder.createSource(context.getContentResolver(), uri)) : MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
                } catch (Exception unused) {
                    bitmapDecodeBitmap = null;
                }
                if (bitmapDecodeBitmap == null) {
                    return null;
                }
                bitmapImage$Companion$fromUriContent$1.L$0 = bitmapDecodeBitmap;
                bitmapImage$Companion$fromUriContent$1.label = 1;
                objA = BitmapImage_androidKt.a(bitmapDecodeBitmap, bitmapImage$Companion$fromUriContent$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bitmapDecodeBitmap = (Bitmap) bitmapImage$Companion$fromUriContent$1.L$0;
                ResultKt.b(objA);
            }
            return new BitmapImage(bitmapDecodeBitmap, (byte[]) objA);
        }
    }

    public BitmapImage(Bitmap bitmap, byte[] byteArray) {
        Intrinsics.i(bitmap, "bitmap");
        Intrinsics.i(byteArray, "byteArray");
        this.f2782a = byteArray;
    }
}
