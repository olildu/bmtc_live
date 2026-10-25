package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.compose.resources.ImageCache;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class fa0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15623a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ fa0(int i, int i2, int i3) {
        this.f15623a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15623a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                Intrinsics.i(bArr, "<this>");
                BitmapFactory.Options options = new BitmapFactory.Options();
                int i = this.b;
                int i2 = this.c;
                if (i > i2) {
                    options.inDensity = i;
                    options.inTargetDensity = i2;
                }
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                Intrinsics.h(bitmapDecodeByteArray, "decodeByteArray(...)");
                return new ImageCache.Bitmap(AndroidImageBitmap_androidKt.asImageBitmap(bitmapDecodeByteArray));
            case 1:
                return ImeEditCommand_androidKt.deleteSurroundingTextInCodePoints$lambda$0(this.b, this.c, (TextFieldBuffer) obj);
            default:
                return ImeEditCommand_androidKt.setComposingRegion$lambda$0(this.b, this.c, (TextFieldBuffer) obj);
        }
    }
}
