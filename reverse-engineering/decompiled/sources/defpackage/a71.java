package defpackage;

import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a71 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170a = 0;
    public final /* synthetic */ SelectionRegistrarImpl b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ SelectionManager d;

    public /* synthetic */ a71(SelectionManager selectionManager, SelectionRegistrarImpl selectionRegistrarImpl, Function2 function2) {
        this.d = selectionManager;
        this.b = selectionRegistrarImpl;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f170a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return SelectionContainerKt.SelectionContainer$lambda$9(this.d, this.b, this.c, composer, iIntValue);
            default:
                return SelectionContainerKt.SelectionContainer$lambda$9$0(this.b, this.c, this.d, composer, iIntValue);
        }
    }

    public /* synthetic */ a71(SelectionRegistrarImpl selectionRegistrarImpl, Function2 function2, SelectionManager selectionManager) {
        this.b = selectionRegistrarImpl;
        this.c = function2;
        this.d = selectionManager;
    }
}
