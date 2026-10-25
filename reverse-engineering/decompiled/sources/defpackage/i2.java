package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import app.chalo.ads.HomeInlineNativeTemplateBinder_androidKt;
import app.chalo.ads.HomeInlineTemplateLayoutConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15876a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ HomeInlineTemplateLayoutConfig c;
    public final /* synthetic */ Float d;
    public final /* synthetic */ String e;

    public /* synthetic */ i2(Context context, HomeInlineTemplateLayoutConfig homeInlineTemplateLayoutConfig, Float f, String str, int i) {
        this.f15876a = i;
        this.b = context;
        this.c = homeInlineTemplateLayoutConfig;
        this.d = f;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15876a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) obj;
                if (frameLayout != null) {
                    HomeInlineNativeTemplateBinder_androidKt.a(this.b, frameLayout, this.c, this.d, this.e, "customNative");
                }
                break;
            default:
                FrameLayout frameLayout2 = (FrameLayout) obj;
                if (frameLayout2 != null) {
                    HomeInlineNativeTemplateBinder_androidKt.a(this.b, frameLayout2, this.c, this.d, this.e, "native");
                }
                break;
        }
        return Unit.f17538a;
    }
}
