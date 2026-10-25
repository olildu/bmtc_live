package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.media.AudioProfile;
import android.view.autofill.AutofillId;
import android.window.OnBackInvokedDispatcher;
import androidx.media3.exoplayer.image.BitmapFactoryImageDecoder;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.apache.commons.io.output.AbstractByteArrayOutputStream;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q3 implements BitmapFactoryImageDecoder.BitmapDecoder, AbstractByteArrayOutputStream.InputStreamConstructor {
    public static /* bridge */ /* synthetic */ ImageDecoder.Source e(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ AnimatedImageDrawable g(Object obj) {
        return (AnimatedImageDrawable) obj;
    }

    public static /* bridge */ /* synthetic */ AudioProfile h(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillId i(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher j(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream.InputStreamConstructor
    public InputStream construct(byte[] bArr, int i, int i2) {
        return new ByteArrayInputStream(bArr, i, i2);
    }

    @Override // androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.BitmapDecoder
    public Bitmap decode(byte[] bArr, int i) {
        return BitmapFactoryImageDecoder.access$100(bArr, i);
    }
}
