package defpackage;

import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSize;
import app.chalo.ncmc.ui.landing.ChaloCardInfoScreenLayoutType;
import app.chalo.ncmc.ui.landing.ChaloCardInfoViewState;
import app.chalo.ncmc.ui.landing.FetchCardStatus;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19714a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u4(Object obj, boolean z, boolean z2, int i) {
        this.f19714a = i;
        this.d = obj;
        this.b = z;
        this.c = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19714a) {
            case 0:
                return AndroidSelectionHandles_androidKt.SelectionHandle_wLIcFTc$lambda$0$0((OffsetProvider) this.d, this.b, this.c, (SemanticsPropertyReceiver) obj);
            case 1:
                ArrayList arrayList = (ArrayList) this.d;
                ChaloCardInfoViewState it = (ChaloCardInfoViewState) obj;
                Intrinsics.i(it, "it");
                return ChaloCardInfoViewState.a(it, null, arrayList, false, 0, null, null, null, FetchCardStatus.FETCHED_AND_AVAILABLE, ChaloCardInfoScreenLayoutType.ALL_CARDS, null, false, null, null, null, null, false, null, this.b, null, false, null, this.c, 3931761);
            default:
                return SwipeToDismissBoxKt.SwipeToDismissBox$lambda$11$lambda$10$lambda$9$lambda$8((IntSize) this.d, this.b, this.c, (DraggableAnchorsConfig) obj);
        }
    }
}
