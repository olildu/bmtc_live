package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import app.chalo.compose.components.ChaloSearchBarComposableKt;
import app.chalo.compose.components.textfields.ChaloTextFieldKt;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ml implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18406a = 0;
    public final /* synthetic */ TextFieldValue b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ ml(Modifier modifier, String str, TextStyle textStyle, TextFieldValue textFieldValue, Function1 function1, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, TextFieldColors textFieldColors, Function2 function2, int i, int i2) {
        this.c = modifier;
        this.h = str;
        this.i = textStyle;
        this.b = textFieldValue;
        this.d = function1;
        this.j = keyboardOptions;
        this.k = keyboardActions;
        this.l = textFieldColors;
        this.e = function2;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18406a) {
            case 0:
                ((Integer) obj2).getClass();
                ChaloSearchBarComposableKt.c(this.c, (String) this.h, (TextStyle) this.i, this.b, this.d, (KeyboardOptions) this.j, (KeyboardActions) this.k, (TextFieldColors) this.l, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                ChaloTextFieldKt.b((BaseTextFieldUIState.TextFieldUIState) this.h, this.b, this.c, this.d, this.e, (Function2) this.i, (MutableInteractionSource) this.j, (VisualTransformation) this.k, (Function3) this.l, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1), this.g);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ ml(BaseTextFieldUIState.TextFieldUIState textFieldUIState, TextFieldValue textFieldValue, Modifier modifier, Function1 function1, Function2 function2, Function2 function3, MutableInteractionSource mutableInteractionSource, VisualTransformation visualTransformation, Function3 function4, int i, int i2) {
        this.h = textFieldUIState;
        this.b = textFieldValue;
        this.c = modifier;
        this.d = function1;
        this.e = function2;
        this.i = function3;
        this.j = mutableInteractionSource;
        this.k = visualTransformation;
        this.l = function4;
        this.f = i;
        this.g = i2;
    }
}
