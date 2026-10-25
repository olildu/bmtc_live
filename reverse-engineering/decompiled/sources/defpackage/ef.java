package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ef implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15546a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ Shape c;
    public final /* synthetic */ CardColors d;
    public final /* synthetic */ CardElevation e;
    public final /* synthetic */ BorderStroke f;
    public final /* synthetic */ Function3 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ ef(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, Function3 function3, int i, int i2, int i3) {
        this.f15546a = i3;
        this.b = modifier;
        this.c = shape;
        this.d = cardColors;
        this.e = cardElevation;
        this.f = borderStroke;
        this.g = function3;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15546a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return CardKt.OutlinedCard$lambda$5(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return CardKt.Card$lambda$0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (Composer) obj, iIntValue2);
        }
    }
}
