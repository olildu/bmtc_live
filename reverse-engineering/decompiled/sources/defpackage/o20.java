package defpackage;

import androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o20 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18563a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o20(MutableState mutableState, String str, Function1 function1, boolean z) {
        this.c = mutableState;
        this.d = str;
        this.e = function1;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18563a) {
            case 0:
                return ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1.menuAnchor_2Hz36ac$lambda$1((MutableState) this.c, (String) this.d, (Function1) this.e, this.b);
            default:
                return NavigationItemKt.AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$18$lambda$17(this.b, (TextStyle) this.c, (TextStyle) this.d, (State) this.e);
        }
    }

    public /* synthetic */ o20(boolean z, TextStyle textStyle, TextStyle textStyle2, State state) {
        this.b = z;
        this.c = textStyle;
        this.d = textStyle2;
        this.e = state;
    }
}
