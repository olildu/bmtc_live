package defpackage;

import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.foundation.BasicTooltip_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oa implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18580a;
    public final /* synthetic */ PopupPositionProvider b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ BasicTooltipState d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ oa(PopupPositionProvider popupPositionProvider, Function2 function2, BasicTooltipState basicTooltipState, Modifier modifier, boolean z, boolean z2, Function2 function3, int i, int i2, int i3) {
        this.f18580a = i3;
        this.b = popupPositionProvider;
        this.c = function2;
        this.d = basicTooltipState;
        this.e = modifier;
        this.f = z;
        this.g = z2;
        this.h = function3;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18580a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicTooltipKt.BasicTooltipBox$lambda$2(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return BasicTooltip_androidKt.BasicTooltipBoxAndroid$lambda$0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, iIntValue2);
        }
    }
}
