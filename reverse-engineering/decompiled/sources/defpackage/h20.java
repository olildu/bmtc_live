package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.media3.exoplayer.ExoPlayer;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchItem;
import app.chalo.livetracking.universalsearch.ui.compose.RecentSearchedItemComposableKt;
import app.chalo.livetracking.universalsearch.ui.compose.SearchRouteItemComposableKt;
import app.chalo.ncmc.ui.ncmcofflinerecharge.compose.OfflineCardRechargeScreenKt;
import app.chalo.titoridedetail.ui.compose.ExoPlayerComposableKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15785a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h20(Modifier modifier, ExoPlayer exoPlayer, boolean z, boolean z2, int i) {
        this.f15785a = 0;
        this.b = modifier;
        this.f = exoPlayer;
        this.c = z;
        this.d = z2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15785a) {
            case 0:
                ((Integer) obj2).getClass();
                ExoPlayerComposableKt.a((Modifier) this.b, (ExoPlayer) this.f, this.c, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                OfflineCardRechargeScreenKt.d((Modifier) this.b, this.c, this.d, (String) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                RecentSearchedItemComposableKt.b((UniversalSearchRecentSearchItem) this.b, this.c, this.d, (Function1) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                SearchRouteItemComposableKt.a((AnnotatedString) this.b, this.c, (String) this.f, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ h20(AnnotatedString annotatedString, boolean z, String str, boolean z2, int i) {
        this.f15785a = 3;
        this.b = annotatedString;
        this.c = z;
        this.f = str;
        this.d = z2;
        this.e = i;
    }

    public /* synthetic */ h20(Object obj, boolean z, boolean z2, Object obj2, int i, int i2) {
        this.f15785a = i2;
        this.b = obj;
        this.c = z;
        this.d = z2;
        this.f = obj2;
        this.e = i;
    }
}
