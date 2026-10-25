package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassUserProofUploadScreenKt;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassUserProofUploadUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kg1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17497a;
    public final /* synthetic */ SuperPassUserProofUploadUIState b;
    public final /* synthetic */ int c;

    public /* synthetic */ kg1(SuperPassUserProofUploadUIState superPassUserProofUploadUIState, int i, int i2) {
        this.f17497a = i2;
        this.b = superPassUserProofUploadUIState;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f17497a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                SuperPassUserProofUploadScreenKt.d(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            default:
                SuperPassUserProofUploadScreenKt.c(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
        }
        return Unit.f17538a;
    }
}
