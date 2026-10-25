package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.uistate.textField.TextFieldLabelPlaceholderUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15655a;
    public final /* synthetic */ TextFieldLabelPlaceholderUIState b;

    public /* synthetic */ fm(TextFieldLabelPlaceholderUIState textFieldLabelPlaceholderUIState, int i) {
        this.f15655a = i;
        this.b = textFieldLabelPlaceholderUIState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15655a) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-819110419, iIntValue, -1, "app.chalo.compose.components.textfields.defaultPlaceholderHelper.<anonymous> (ChaloTextField.kt:281)");
                    }
                    TextFieldLabelPlaceholderUIState textFieldLabelPlaceholderUIState = this.b;
                    if (!(textFieldLabelPlaceholderUIState instanceof TextFieldLabelPlaceholderUIState.TextLabel)) {
                        throw pk0.p(composer, -1186097009);
                    }
                    composer.startReplaceGroup(1885775918);
                    ChaloTextViewKt.a(null, ((TextFieldLabelPlaceholderUIState.TextLabel) textFieldLabelPlaceholderUIState).f10107a, null, null, composer, 0, 13);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.f17538a;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1202457646, iIntValue2, -1, "app.chalo.compose.components.textfields.defaultLabelHelper.<anonymous> (ChaloTextField.kt:269)");
                    }
                    TextFieldLabelPlaceholderUIState textFieldLabelPlaceholderUIState2 = this.b;
                    if (!(textFieldLabelPlaceholderUIState2 instanceof TextFieldLabelPlaceholderUIState.TextLabel)) {
                        throw pk0.p(composer2, 215595652);
                    }
                    composer2.startReplaceGroup(-1906397613);
                    ChaloTextViewKt.a(null, ((TextFieldLabelPlaceholderUIState.TextLabel) textFieldLabelPlaceholderUIState2).f10107a, null, null, composer2, 0, 13);
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.f17538a;
        }
    }
}
