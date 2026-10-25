package defpackage;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.window.DialogProperties;
import app.chalo.compose.SearchFieldWithSwapButtonCardKt;
import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.compose.components.dialogs.TncDialogKt;
import app.chalo.home.ui.common.TitoRideDetailsBottomSheetLayoutKt;
import app.chalo.login.ui.userconsent.UserConsentScreenKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.titoridedetail.data.app.TitoRideDataAppModel;
import app.chalo.titoridedetail.ui.TITORideDetailBottomsheetType;
import app.chalo.titoridedetail.ui.compose.TitoRideDataScreenKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.webview.WebViewUIState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l61 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18285a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ l61(TitoRideDataAppModel titoRideDataAppModel, String str, String str2, Modifier modifier, Function1 function1, int i) {
        this.f18285a = 2;
        this.b = titoRideDataAppModel;
        this.e = str;
        this.f = str2;
        this.d = modifier;
        this.g = function1;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18285a) {
            case 0:
                ((Integer) obj2).getClass();
                SearchFieldWithSwapButtonCardKt.e((Modifier) this.d, (String) this.e, (String) this.f, (Function0) this.b, (TextStyle) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).intValue();
                TitoRideDataScreenKt.p((TITORideDetailBottomsheetType) this.d, (StringEnum) this.e, (StringEnum) this.f, (Function0) this.b, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 2:
                ((Integer) obj2).getClass();
                TitoRideDetailsBottomSheetLayoutKt.c((TitoRideDataAppModel) this.b, (String) this.e, (String) this.f, (Modifier) this.d, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).getClass();
                TncDialogKt.c((List) this.d, (Function0) this.b, (Function0) this.e, (Function0) this.f, (DialogProperties) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 4:
                int iIntValue = ((Integer) obj2).intValue();
                return TransitionKt.UpdateInitialAndTargetValues$lambda$0((Transition) this.d, (Transition.TransitionAnimationState) this.e, this.f, this.b, (FiniteAnimationSpec) this.g, this.c, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                UserConsentScreenKt.d((WebViewUIState) this.e, (CircularProgressIndicatorUIState) this.f, (Function1) this.b, (ChaloColorToken) this.g, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ l61(WebViewUIState webViewUIState, CircularProgressIndicatorUIState circularProgressIndicatorUIState, Function1 function1, ChaloColorToken chaloColorToken, Modifier modifier, int i) {
        this.f18285a = 5;
        this.e = webViewUIState;
        this.f = circularProgressIndicatorUIState;
        this.b = function1;
        this.g = chaloColorToken;
        this.d = modifier;
        this.c = i;
    }

    public /* synthetic */ l61(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.f18285a = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = obj4;
        this.g = obj5;
        this.c = i;
    }

    public /* synthetic */ l61(List list, Function0 function0, Function0 function1, Function0 function2, DialogProperties dialogProperties, int i) {
        this.f18285a = 3;
        this.d = list;
        this.b = function0;
        this.e = function1;
        this.f = function2;
        this.g = dialogProperties;
        this.c = i;
    }
}
