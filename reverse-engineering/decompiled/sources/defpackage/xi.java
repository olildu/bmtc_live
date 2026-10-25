package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import app.chalo.ncmc.ui.cardlinking.linking.compose.ChaloCardLinkCardScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xi implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20022a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ SoftwareKeyboardController d;
    public final /* synthetic */ FocusRequester e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ xi(String str, Function1 function1, SoftwareKeyboardController softwareKeyboardController, FocusRequester focusRequester, int i, int i2, int i3) {
        this.f20022a = i3;
        this.b = str;
        this.c = function1;
        this.d = softwareKeyboardController;
        this.e = focusRequester;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20022a) {
            case 0:
                ((Integer) obj2).intValue();
                ChaloCardLinkCardScreenKt.c(this.b, this.c, this.d, this.e, this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.g | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ChaloCardLinkCardScreenKt.b(this.b, this.c, this.d, this.e, this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.g | 1));
                break;
        }
        return Unit.f17538a;
    }
}
