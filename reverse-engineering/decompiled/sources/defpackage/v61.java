package defpackage;

import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v61 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19808a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Role d;
    public final /* synthetic */ Function e;

    public /* synthetic */ v61(boolean z, boolean z2, Role role, Function function, int i) {
        this.f19808a = i;
        this.b = z;
        this.c = z2;
        this.d = role;
        this.e = function;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f19808a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return SelectableKt.selectable_XHw0xAI$lambda$1(this.b, this.c, this.d, (Function0) this.e, (Modifier) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return ToggleableKt.toggleable_XHw0xAI$lambda$1(this.b, this.c, this.d, (Function1) this.e, (Modifier) obj, (Composer) obj2, iIntValue2);
        }
    }
}
