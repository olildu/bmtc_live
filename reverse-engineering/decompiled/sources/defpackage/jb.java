package defpackage;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17388a;
    public final /* synthetic */ AnnotatedString b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ jb(AnnotatedString annotatedString, Function0 function0, int i) {
        this.f17388a = i;
        this.b = annotatedString;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f17388a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                if (((AnnotatedString.Range) CollectionsKt.H(this.b.getStringAnnotations("ClickableText", iIntValue, iIntValue))) != null) {
                    this.c.invoke();
                }
                break;
            case 1:
                if (((AnnotatedString.Range) CollectionsKt.H(this.b.getStringAnnotations("ClickableText", iIntValue, iIntValue))) != null) {
                    this.c.invoke();
                }
                break;
            default:
                if (((AnnotatedString.Range) CollectionsKt.H(this.b.getStringAnnotations("ClickableText", iIntValue, iIntValue))) != null) {
                    this.c.invoke();
                }
                break;
        }
        return Unit.f17538a;
    }
}
