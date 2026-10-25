package app.chalo.uistate.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"app/chalo/uistate/text/StyledTextClickHandler$Companion$create$1", "Lapp/chalo/uistate/text/StyledTextClickHandler;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StyledTextClickHandler$Companion$create$1 implements StyledTextClickHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10085a;
    public final String b;
    public final /* synthetic */ Function0 c;

    public StyledTextClickHandler$Companion$create$1(String str, String str2, Function0 function0) {
        this.c = function0;
        this.f10085a = str;
        this.b = str2;
    }

    @Override // app.chalo.uistate.text.StyledTextClickHandler
    public final void a() {
        this.c.invoke();
    }

    @Override // app.chalo.uistate.text.StyledTextClickHandler
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // app.chalo.uistate.text.StyledTextClickHandler
    /* JADX INFO: renamed from: getTag, reason: from getter */
    public final String getF10085a() {
        return this.f10085a;
    }
}
