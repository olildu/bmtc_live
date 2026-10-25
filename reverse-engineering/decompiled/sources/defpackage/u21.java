package defpackage;

import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u21 implements DoubleFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19710a;
    public final /* synthetic */ TransferParameters b;

    public /* synthetic */ u21(TransferParameters transferParameters, int i) {
        this.f19710a = i;
        this.b = transferParameters;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        switch (this.f19710a) {
            case 0:
                return Rgb.Companion.generateEotf$lambda$0(this.b, d);
            case 1:
                return Rgb.Companion.generateEotf$lambda$1(this.b, d);
            case 2:
                return Rgb.Companion.generateEotf$lambda$2(this.b, d);
            case 3:
                return Rgb.Companion.generateEotf$lambda$3(this.b, d);
            case 4:
                return Rgb.Companion.generateOetf$lambda$0(this.b, d);
            case 5:
                return Rgb.Companion.generateOetf$lambda$1(this.b, d);
            case 6:
                return Rgb.Companion.generateOetf$lambda$2(this.b, d);
            default:
                return Rgb.Companion.generateOetf$lambda$3(this.b, d);
        }
    }
}
