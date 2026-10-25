package defpackage;

import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.TypefaceRequest;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v40 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19801a;
    public final /* synthetic */ FontFamilyResolverImpl b;

    public /* synthetic */ v40(FontFamilyResolverImpl fontFamilyResolverImpl, int i) {
        this.f19801a = i;
        this.b = fontFamilyResolverImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19801a) {
            case 0:
                return FontFamilyResolverImpl.createDefaultTypeface$lambda$0(this.b, (TypefaceRequest) obj);
            default:
                return FontFamilyResolverImpl.preload$lambda$1(this.b, (TypefaceRequest) obj);
        }
    }
}
