package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class df implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15455a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Shape e;
    public final /* synthetic */ CardColors f;
    public final /* synthetic */ CardElevation g;
    public final /* synthetic */ BorderStroke h;
    public final /* synthetic */ MutableInteractionSource i;
    public final /* synthetic */ Function3 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    public /* synthetic */ df(Function0 function0, Modifier modifier, boolean z, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, int i3) {
        this.f15455a = i3;
        this.b = function0;
        this.c = modifier;
        this.d = z;
        this.e = shape;
        this.f = cardColors;
        this.g = cardElevation;
        this.h = borderStroke;
        this.i = mutableInteractionSource;
        this.j = function3;
        this.k = i;
        this.l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15455a) {
            case 0:
                return CardKt.Card$lambda$2(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return CardKt.OutlinedCard$lambda$6(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
