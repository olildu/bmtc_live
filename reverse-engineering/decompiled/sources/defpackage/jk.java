package defpackage;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.ChaloGradientBackgroundKt;
import app.chalo.homescreen.data.model.app.BgHighlightType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreenKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17414a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ jk(BoxScope boxScope, BgHighlightType bgHighlightType, float f, ChaloColorToken chaloColorToken, int i, int i2) {
        this.e = boxScope;
        this.f = bgHighlightType;
        this.c = f;
        this.g = chaloColorToken;
        this.b = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17414a) {
            case 0:
                ((Integer) obj2).getClass();
                ChaloGradientBackgroundKt.a((BoxScope) this.e, (BgHighlightType) this.f, this.c, (ChaloColorToken) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1), this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                QRValidationScreenKt.f((List) this.e, (Modifier) this.f, this.b, this.c, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ jk(List list, Modifier modifier, int i, float f, Function1 function1, int i2) {
        this.e = list;
        this.f = modifier;
        this.b = i;
        this.c = f;
        this.g = function1;
        this.d = i2;
    }
}
