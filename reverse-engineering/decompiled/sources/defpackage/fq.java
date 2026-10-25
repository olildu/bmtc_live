package defpackage;

import androidx.compose.foundation.text.CommonContextMenuAreaKt;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fq implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15664a;
    public final /* synthetic */ TextFieldSelectionManager b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ int d;

    public /* synthetic */ fq(TextFieldSelectionManager textFieldSelectionManager, Function2 function2, int i, int i2) {
        this.f15664a = i2;
        this.b = textFieldSelectionManager;
        this.c = function2;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15664a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$4(this.b, this.c, this.d, composer, iIntValue);
            default:
                return ContextMenu_androidKt.ContextMenuArea$lambda$0(this.b, this.c, this.d, composer, iIntValue);
        }
    }
}
