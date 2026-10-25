package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextLinkScope;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z9 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20177a;
    public final /* synthetic */ TextLinkScope b;

    public /* synthetic */ z9(TextLinkScope textLinkScope, int i) {
        this.f20177a = i;
        this.b = textLinkScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zLayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0;
        switch (this.f20177a) {
            case 0:
                zLayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0 = BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0(this.b);
                break;
            case 1:
                zLayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0 = BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$8$0(this.b);
                break;
            default:
                zLayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0 = TextLinkScope._get_shouldMeasureLinks_$lambda$0(this.b);
                break;
        }
        return Boolean.valueOf(zLayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0);
    }
}
