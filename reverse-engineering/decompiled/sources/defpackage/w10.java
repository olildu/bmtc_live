package defpackage;

import androidx.media3.common.MimeTypes;
import coil3.decode.ExifOrientationStrategy;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w10 implements ExifOrientationStrategy {
    @Override // coil3.decode.ExifOrientationStrategy
    public final boolean a(String str) {
        if (str != null) {
            return str.equals(MimeTypes.IMAGE_JPEG) || str.equals(MimeTypes.IMAGE_WEBP) || str.equals(MimeTypes.IMAGE_HEIC) || str.equals(MimeTypes.IMAGE_HEIF);
        }
        return false;
    }
}
