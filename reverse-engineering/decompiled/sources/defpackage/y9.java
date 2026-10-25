package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y9 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20088a;
    public final /* synthetic */ TextLinkScope b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ y9(TextLinkScope textLinkScope, Function1 function1, int i) {
        this.f20088a = i;
        this.b = textLinkScope;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20088a) {
            case 0:
                return BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$6$0(this.b, this.c, (TextLayoutResult) obj);
            default:
                return TextLinkScope.StyleAnnotation$lambda$0$0(this.b, this.c, (DisposableEffectScope) obj);
        }
    }
}
