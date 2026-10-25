package defpackage;

import androidx.compose.ui.unit.Density;
import app.chalo.utils.SheetDefaultsHelperKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j81 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17382a;
    public final /* synthetic */ Density b;
    public final /* synthetic */ float c;

    public /* synthetic */ j81(Density density, float f, int i) {
        this.f17382a = i;
        this.b = density;
        this.c = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float fMo404toPx0680j_4;
        int i = this.f17382a;
        float f = this.c;
        Density density = this.b;
        switch (i) {
            case 0:
                float f2 = SheetDefaultsHelperKt.f10439a;
                fMo404toPx0680j_4 = density.mo404toPx0680j_4(f);
                break;
            case 1:
                float f3 = SheetDefaultsHelperKt.f10439a;
                fMo404toPx0680j_4 = density.mo404toPx0680j_4(f);
                break;
            case 2:
                fMo404toPx0680j_4 = density.mo404toPx0680j_4(f);
                break;
            default:
                fMo404toPx0680j_4 = density.mo404toPx0680j_4(f);
                break;
        }
        return Float.valueOf(fMo404toPx0680j_4);
    }
}
