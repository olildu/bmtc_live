package app.chalo.ncmc.ui.entercarddetails.compose;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class EnterCardDetailsScreenKt$sam$androidx_compose_ui_text_input_VisualTransformation$0 implements VisualTransformation, FunctionAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f6338a;

    public EnterCardDetailsScreenKt$sam$androidx_compose_ui_text_input_VisualTransformation$0(Function1 function) {
        Intrinsics.i(function, "function");
        this.f6338a = function;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VisualTransformation) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.d(this.f6338a, ((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final /* synthetic */ TransformedText filter(AnnotatedString annotatedString) {
        return (TransformedText) this.f6338a.invoke(annotatedString);
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return this.f6338a;
    }

    public final int hashCode() {
        return this.f6338a.hashCode();
    }
}
