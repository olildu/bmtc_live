package defpackage;

import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.compose.components.chalomap.InfoWindowKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f9 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15619a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ f9(int i, int i2, Function2 function2) {
        this.f15619a = i2;
        this.b = function2;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f15619a) {
            case 0:
                return BasicSecureTextFieldKt.DisableCutCopy$lambda$1(this.b, this.c, composer, num.intValue());
            case 1:
                return DefaultTextContextMenuDropdownProvider_androidKt.ProvideDefaultTextContextMenuDropdown$lambda$0(this.b, this.c, composer, num.intValue());
            case 2:
                return EffectsKt.LaunchedEffect$lambda$0(this.b, this.c, composer, num.intValue());
            case 3:
                num.intValue();
                InfoWindowKt.a(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                return Unit.f17538a;
            default:
                return SelectionContainerKt.DisableSelection$lambda$0(this.b, this.c, composer, num.intValue());
        }
    }
}
