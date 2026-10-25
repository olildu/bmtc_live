package defpackage;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.CheckboxColors;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.RadioButtonColors;
import androidx.compose.material3.RadioButtonKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;
import app.chalo.compose.components.UserSelfReviewComposableKt;
import app.chalo.usecase.FeedbackData;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c9 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11264a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ c9(TextFieldDefaults textFieldDefaults, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, int i, int i2) {
        this.f11264a = 4;
        this.g = textFieldDefaults;
        this.b = z;
        this.c = z2;
        this.d = interactionSource;
        this.h = textFieldColors;
        this.i = shape;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11264a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicEdgeToEdgeDialog_androidKt.BasicEdgeToEdgeDialog$lambda$12((Function0) this.g, (Modifier) this.d, (DialogProperties) this.h, this.b, this.c, (Function3) this.i, this.e, this.f, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return BasicTooltipKt.WrappedAnchor$lambda$7(this.b, (TooltipState) this.g, (MutableState) this.h, this.c, (Modifier) this.d, (Function2) this.i, this.e, this.f, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return CheckboxKt.Checkbox$lambda$3(this.b, (Function1) this.g, (Modifier) this.d, this.c, (CheckboxColors) this.h, (MutableInteractionSource) this.i, this.e, this.f, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return RadioButtonKt.RadioButton$lambda$2(this.b, (Function0) this.g, (Modifier) this.d, this.c, (RadioButtonColors) this.h, (MutableInteractionSource) this.i, this.e, this.f, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return TextFieldDefaults.ContainerBox$lambda$7((TextFieldDefaults) this.g, this.b, this.c, (InteractionSource) this.d, (TextFieldColors) this.h, (Shape) this.i, this.e, this.f, (Composer) obj, iIntValue5);
            default:
                ((Integer) obj2).getClass();
                UserSelfReviewComposableKt.b((FeedbackData) this.g, (List) this.d, (Function1) this.h, (Function1) this.i, this.b, this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1), this.f);
                return Unit.f17538a;
        }
    }

    public /* synthetic */ c9(FeedbackData feedbackData, List list, Function1 function1, Function1 function2, boolean z, boolean z2, int i, int i2) {
        this.f11264a = 5;
        this.g = feedbackData;
        this.d = list;
        this.h = function1;
        this.i = function2;
        this.b = z;
        this.c = z2;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ c9(Function0 function0, Modifier modifier, DialogProperties dialogProperties, boolean z, boolean z2, Function3 function3, int i, int i2) {
        this.f11264a = 0;
        this.g = function0;
        this.d = modifier;
        this.h = dialogProperties;
        this.b = z;
        this.c = z2;
        this.i = function3;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ c9(boolean z, TooltipState tooltipState, MutableState mutableState, boolean z2, Modifier modifier, Function2 function2, int i, int i2) {
        this.f11264a = 1;
        this.b = z;
        this.g = tooltipState;
        this.h = mutableState;
        this.c = z2;
        this.d = modifier;
        this.i = function2;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ c9(boolean z, Function function, Modifier modifier, boolean z2, Object obj, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
        this.f11264a = i3;
        this.b = z;
        this.g = function;
        this.d = modifier;
        this.c = z2;
        this.h = obj;
        this.i = mutableInteractionSource;
        this.e = i;
        this.f = i2;
    }
}
