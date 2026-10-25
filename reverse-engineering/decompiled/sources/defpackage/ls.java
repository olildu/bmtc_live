package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.lazy.LazyListCacheWindowScope;
import androidx.compose.foundation.lazy.LazyListPrefetchResultScope;
import app.cash.sqldelight.db.SqlCursor;
import app.chalo.stoptripdetails.data.model.StopTripDetailsUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ls implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18343a;
    public final /* synthetic */ Function2 b;

    public /* synthetic */ ls(int i, Function2 function2) {
        this.f18343a = i;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18343a) {
            case 0:
                SqlCursor sqlCursor = (SqlCursor) obj;
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                Intrinsics.f(string);
                return this.b.invoke(strI, string);
            case 1:
                SqlCursor sqlCursor2 = (SqlCursor) obj;
                String strI2 = cb0.i(sqlCursor2, "cursor", 0);
                String string2 = sqlCursor2.getString(1);
                Intrinsics.f(string2);
                return this.b.invoke(strI2, string2);
            case 2:
                return LazyListCacheWindowScope.schedulePrefetch$lambda$0(this.b, (LazyListPrefetchResultScope) obj);
            case 3:
                StopTripDetailsUiModel it = (StopTripDetailsUiModel) obj;
                Intrinsics.i(it, "it");
                this.b.invoke(it, it.f9470a);
                return Unit.f17538a;
            case 4:
                SqlCursor sqlCursor3 = (SqlCursor) obj;
                Long lI = uf0.i(sqlCursor3, "cursor", 0);
                String string3 = sqlCursor3.getString(1);
                Intrinsics.f(string3);
                return this.b.invoke(lI, string3);
            case 5:
                SqlCursor sqlCursor4 = (SqlCursor) obj;
                Long lI2 = uf0.i(sqlCursor4, "cursor", 0);
                String string4 = sqlCursor4.getString(1);
                Intrinsics.f(string4);
                return this.b.invoke(lI2, string4);
            case 6:
                StopTripDetailsUiModel it2 = (StopTripDetailsUiModel) obj;
                Intrinsics.i(it2, "it");
                this.b.invoke(it2, it2.f9470a);
                return Unit.f17538a;
            default:
                return SuspendAnimationKt.animateDecay$lambda$0(this.b, (AnimationScope) obj);
        }
    }
}
