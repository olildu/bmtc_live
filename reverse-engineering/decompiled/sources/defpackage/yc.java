package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yc implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20095a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ MutableState d;

    public /* synthetic */ yc(int i, Function1 function1, MutableState mutableState, int i2) {
        this.f20095a = i2;
        this.b = i;
        this.c = function1;
        this.d = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String text;
        switch (this.f20095a) {
            case 0:
                TextFieldValue it = (TextFieldValue) obj;
                Intrinsics.i(it, "it");
                String string = StringsKt.u0(it.getText()).toString();
                StringBuilder sb = new StringBuilder();
                int length = string.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = string.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                String string2 = sb.toString();
                if (string2.length() <= this.b) {
                    this.d.setValue(TextFieldValue.m6985copy3r_uNRQ$default(it, string2, 0L, (TextRange) null, 6, (Object) null));
                    this.c.invoke(new FareDetailsIntent.UserBillingInfoMobileNumberChangedIntent(string2));
                }
                break;
            case 1:
                TextFieldValue it2 = (TextFieldValue) obj;
                Intrinsics.i(it2, "it");
                String text2 = it2.getText();
                StringBuilder sb2 = new StringBuilder();
                int length2 = text2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    char cCharAt2 = text2.charAt(i2);
                    if (Character.isDigit(cCharAt2)) {
                        sb2.append(cCharAt2);
                    }
                }
                String string3 = sb2.toString();
                if (string3.length() <= this.b) {
                    this.c.invoke(string3);
                    this.d.setValue(TextFieldValue.m6985copy3r_uNRQ$default(it2, string3, 0L, (TextRange) null, 6, (Object) null));
                }
                break;
            default:
                TextFieldValue it3 = (TextFieldValue) obj;
                Intrinsics.i(it3, "it");
                if (it3.getText().length() > 0) {
                    String string4 = it3.getText();
                    Intrinsics.i(string4, "string");
                    if (string4.charAt(0) == '.') {
                        string4 = "0".concat(string4);
                    }
                    int length3 = string4.length();
                    int i3 = 0;
                    for (int i4 = 0; i4 < string4.length(); i4++) {
                        if (StringsKt.n(CLConstants.DOT_SALT_DELIMETER, string4.charAt(i4))) {
                            i3++;
                        }
                    }
                    if (i3 > 1) {
                        text = StringsKt.s(1, string4);
                    } else {
                        String str = "";
                        boolean z = false;
                        for (int i5 = 0; i5 < length3; i5++) {
                            char cCharAt3 = string4.charAt(i5);
                            if (cCharAt3 == '.' || z) {
                                if (cCharAt3 == '.') {
                                    z = true;
                                } else {
                                    text = str;
                                }
                            }
                            str = str + cCharAt3;
                        }
                        text = str;
                    }
                } else {
                    text = it3.getText();
                }
                String str2 = text;
                if (str2.length() <= this.b) {
                    this.c.invoke(str2);
                    this.d.setValue(TextFieldValue.m6985copy3r_uNRQ$default(it3, str2, 0L, (TextRange) null, 6, (Object) null));
                }
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ yc(MutableState mutableState, Function1 function1, int i) {
        this.f20095a = 0;
        this.b = i;
        this.d = mutableState;
        this.c = function1;
    }
}
