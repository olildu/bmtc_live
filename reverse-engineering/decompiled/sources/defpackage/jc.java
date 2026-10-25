package defpackage;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jc implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17391a;
    public final /* synthetic */ SheetState b;
    public final /* synthetic */ FiniteAnimationSpec c;
    public final /* synthetic */ FiniteAnimationSpec d;
    public final /* synthetic */ FiniteAnimationSpec e;

    public /* synthetic */ jc(SheetState sheetState, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, int i) {
        this.f17391a = i;
        this.b = sheetState;
        this.c = finiteAnimationSpec;
        this.d = finiteAnimationSpec2;
        this.e = finiteAnimationSpec3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17391a) {
            case 0:
                return BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$7$lambda$6(this.b, this.c, this.d, this.e);
            default:
                return ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$1$lambda$0(this.b, this.c, this.d, this.e);
        }
    }
}
