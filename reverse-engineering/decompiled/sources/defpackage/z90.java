package defpackage;

import androidx.compose.ui.graphics.ImageBitmap;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class z90 {
    static {
        ImageBitmap.Companion companion = ImageBitmap.INSTANCE;
    }

    public static /* synthetic */ void a(ImageBitmap imageBitmap, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readPixels");
        }
        if ((i7 & 2) != 0) {
            i = 0;
        }
        if ((i7 & 4) != 0) {
            i2 = 0;
        }
        if ((i7 & 8) != 0) {
            i3 = imageBitmap.getWidth();
        }
        if ((i7 & 16) != 0) {
            i4 = imageBitmap.getHeight();
        }
        if ((i7 & 32) != 0) {
            i5 = 0;
        }
        if ((i7 & 64) != 0) {
            i6 = i3;
        }
        imageBitmap.readPixels(iArr, i, i2, i3, i4, i5, i6);
    }
}
