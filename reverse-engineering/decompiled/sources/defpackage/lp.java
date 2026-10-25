package defpackage;

import androidx.compose.ui.text.input.TextFieldValue;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lp implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18334a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ TextFieldValue c;

    public /* synthetic */ lp(Function1 function1, TextFieldValue textFieldValue, int i) {
        this.f18334a = i;
        this.b = function1;
        this.c = textFieldValue;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18334a) {
            case 0:
                this.b.invoke(new UniversalPickerIntent.SearchBarTextChangeIntent(this.c.getText()));
                break;
            default:
                this.b.invoke(new UniversalPickerIntent.SearchBarTextChangeIntent(this.c.getText()));
                break;
        }
        return Unit.f17538a;
    }
}
