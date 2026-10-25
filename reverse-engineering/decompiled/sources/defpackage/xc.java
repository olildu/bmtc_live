package defpackage;

import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsIntent;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xc implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20006a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ xc(MutableState mutableState, Function1 function1, int i) {
        this.f20006a = i;
        this.c = mutableState;
        this.b = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20006a) {
            case 0:
                TextFieldValue it = (TextFieldValue) obj;
                Intrinsics.i(it, "it");
                this.c.setValue(it);
                this.b.invoke(new FareDetailsIntent.UserBillingInfoNameChangedIntent(StringsKt.u0(it.getText()).toString()));
                return Unit.f17538a;
            case 1:
                TextFieldValue it2 = (TextFieldValue) obj;
                Intrinsics.i(it2, "it");
                this.c.setValue(it2);
                this.b.invoke(new UniversalPickerIntent.SearchBarTextChangeIntent(it2.getText()));
                return Unit.f17538a;
            case 2:
                return ClickableTextKt.ClickableText_4YKlhWE$lambda$3$0(this.c, this.b, (TextLayoutResult) obj);
            case 3:
                TextFieldValue it3 = (TextFieldValue) obj;
                Intrinsics.i(it3, "it");
                this.c.setValue(it3);
                this.b.invoke(new UniversalPickerIntent.SearchBarTextChangeIntent(it3.getText()));
                return Unit.f17538a;
            case 4:
                String filteredAmount = (String) obj;
                Intrinsics.i(filteredAmount, "filteredAmount");
                this.b.invoke(filteredAmount);
                MutableState mutableState = this.c;
                mutableState.setValue(TextFieldValue.m6985copy3r_uNRQ$default((TextFieldValue) mutableState.getValue(), filteredAmount, 0L, (TextRange) null, 6, (Object) null));
                return Unit.f17538a;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                MutableState mutableState2 = this.c;
                mutableState2.setValue(bool);
                Boolean bool2 = (Boolean) mutableState2.getValue();
                bool2.booleanValue();
                this.b.invoke(bool2);
                return Unit.f17538a;
            case 6:
                TextFieldValue it4 = (TextFieldValue) obj;
                Intrinsics.i(it4, "it");
                String text = it4.getText();
                StringBuilder sb = new StringBuilder();
                int length = text.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = text.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                String string = sb.toString();
                this.b.invoke(string);
                this.c.setValue(TextFieldValue.m6985copy3r_uNRQ$default(it4, string, 0L, (TextRange) null, 6, (Object) null));
                return Unit.f17538a;
            case 7:
                TextFieldValue comment = (TextFieldValue) obj;
                Intrinsics.i(comment, "comment");
                this.c.setValue(comment);
                this.b.invoke(comment.getText());
                return Unit.f17538a;
            case 8:
                TextFieldValue it5 = (TextFieldValue) obj;
                Intrinsics.i(it5, "it");
                this.c.setValue(it5);
                Function1 sendIntent = this.b;
                Intrinsics.i(sendIntent, "sendIntent");
                sendIntent.invoke(new UniversalPickerIntent.SearchBarTextChangeIntent(it5.getText()));
                return Unit.f17538a;
            default:
                TextFieldValue it6 = (TextFieldValue) obj;
                Intrinsics.i(it6, "it");
                this.b.invoke(it6.getText());
                this.c.setValue(it6);
                return Unit.f17538a;
        }
    }

    public /* synthetic */ xc(Function1 function1, MutableState mutableState, int i) {
        this.f20006a = i;
        this.b = function1;
        this.c = mutableState;
    }
}
