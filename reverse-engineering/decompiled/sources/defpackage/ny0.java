package defpackage;

import androidx.compose.material3.ProgressIndicatorKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ny0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18552a;
    public final /* synthetic */ float b;

    public /* synthetic */ ny0(float f, int i) {
        this.f18552a = i;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float fLinearProgressIndicator__5eSR_E$lambda$16$lambda$15;
        switch (this.f18552a) {
            case 0:
                fLinearProgressIndicator__5eSR_E$lambda$16$lambda$15 = ProgressIndicatorKt.LinearProgressIndicator__5eSR_E$lambda$16$lambda$15(this.b);
                break;
            default:
                fLinearProgressIndicator__5eSR_E$lambda$16$lambda$15 = ProgressIndicatorKt.CircularProgressIndicator_DUhRLBM$lambda$37$lambda$36(this.b);
                break;
        }
        return Float.valueOf(fLinearProgressIndicator__5eSR_E$lambda$16$lambda$15);
    }
}
