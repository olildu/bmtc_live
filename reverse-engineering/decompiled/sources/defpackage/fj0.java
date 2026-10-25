package defpackage;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fj0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15647a;
    public final /* synthetic */ SheetState b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ fj0(SheetState sheetState, Function0 function0, int i) {
        this.f15647a = i;
        this.b = sheetState;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15647a) {
            case 0:
                return ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$4$lambda$3$lambda$2(this.b, this.c, (Throwable) obj);
            default:
                return ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$7$lambda$6$lambda$5(this.b, this.c, (Throwable) obj);
        }
    }
}
