package app.chalo.scenes.args;

import app.chalo.constants.Source;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.scenes.ChaloScenes;
import defpackage.cb0;
import defpackage.dd;
import defpackage.ll1;
import defpackage.n21;
import defpackage.nf1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/UniversalPickerArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UniversalPickerArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] m;
    public final String b;
    public final String c;
    public final String d;
    public final Source e;
    public final String f;
    public final String g;
    public final String h;
    public final ChaloTransitMode i;
    public final String j;
    public final String k;
    public final UniversalPickerHeaderIcon l;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/UniversalPickerArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/UniversalPickerArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UniversalPickerArgs> serializer() {
            return UniversalPickerArgs$$serializer.f9337a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        m = new Lazy[]{null, null, null, LazyKt.a(lazyThreadSafetyMode, new ll1(19)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new ll1(20)), null, null, LazyKt.a(lazyThreadSafetyMode, new ll1(21))};
    }

    public /* synthetic */ UniversalPickerArgs(int i, String str, String str2, String str3, Source source, String str4, String str5, String str6, ChaloTransitMode chaloTransitMode, String str7, String str8, UniversalPickerHeaderIcon universalPickerHeaderIcon) {
        if (47 != (i & 47)) {
            PluginExceptionsKt.b(UniversalPickerArgs$$serializer.f9337a.getDescriptor(), i, 47);
            throw null;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = source;
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        this.g = str5;
        if ((i & 64) == 0) {
            this.h = null;
        } else {
            this.h = str6;
        }
        if ((i & 128) == 0) {
            this.i = ChaloTransitMode.BUS;
        } else {
            this.i = chaloTransitMode;
        }
        if ((i & 256) == 0) {
            this.j = null;
        } else {
            this.j = str7;
        }
        if ((i & 512) == 0) {
            this.k = null;
        } else {
            this.k = str8;
        }
        if ((i & 1024) == 0) {
            this.l = null;
        } else {
            this.l = universalPickerHeaderIcon;
        }
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.UniversalPicker;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalPickerArgs)) {
            return false;
        }
        UniversalPickerArgs universalPickerArgs = (UniversalPickerArgs) obj;
        return Intrinsics.d(this.b, universalPickerArgs.b) && Intrinsics.d(this.c, universalPickerArgs.c) && Intrinsics.d(this.d, universalPickerArgs.d) && this.e == universalPickerArgs.e && Intrinsics.d(this.f, universalPickerArgs.f) && Intrinsics.d(this.g, universalPickerArgs.g) && Intrinsics.d(this.h, universalPickerArgs.h) && this.i == universalPickerArgs.i && Intrinsics.d(this.j, universalPickerArgs.j) && Intrinsics.d(this.k, universalPickerArgs.k) && this.l == universalPickerArgs.l;
    }

    public final int hashCode() {
        int iF = nf1.f(this.e, nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31);
        String str = this.f;
        int iE = nf1.e((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        String str2 = this.h;
        int iC = n21.c(this.i, (iE + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.j;
        int iHashCode = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode2 = (iHashCode + (str4 == null ? 0 : str4.hashCode())) * 31;
        UniversalPickerHeaderIcon universalPickerHeaderIcon = this.l;
        return iHashCode2 + (universalPickerHeaderIcon != null ? universalPickerHeaderIcon.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UniversalPickerArgs(searchOptions=", this.b, ", searchBarTitle=", this.c, ", searchSource=");
        sbE.append(this.d);
        sbE.append(", screenSource=");
        sbE.append(this.e);
        sbE.append(", searchType=");
        cb0.t(sbE, this.f, ", searchDestination=", this.g, ", requestId=");
        sbE.append(this.h);
        sbE.append(", transitMode=");
        sbE.append(this.i);
        sbE.append(", headerTitle=");
        cb0.t(sbE, this.j, ", headerStepIndicator=", this.k, ", headerIcon=");
        sbE.append(this.l);
        sbE.append(")");
        return sbE.toString();
    }

    public UniversalPickerArgs(String searchOptions, String searchBarTitle, String searchSource, Source screenSource, String str, String str2, String str3, ChaloTransitMode transitMode, String str4, String str5, UniversalPickerHeaderIcon universalPickerHeaderIcon, int i) {
        str = (i & 16) != 0 ? null : str;
        str3 = (i & 64) != 0 ? null : str3;
        transitMode = (i & 128) != 0 ? ChaloTransitMode.BUS : transitMode;
        str4 = (i & 256) != 0 ? null : str4;
        str5 = (i & 512) != 0 ? null : str5;
        universalPickerHeaderIcon = (i & 1024) != 0 ? null : universalPickerHeaderIcon;
        Intrinsics.i(searchOptions, "searchOptions");
        Intrinsics.i(searchBarTitle, "searchBarTitle");
        Intrinsics.i(searchSource, "searchSource");
        Intrinsics.i(screenSource, "screenSource");
        Intrinsics.i(transitMode, "transitMode");
        this.b = searchOptions;
        this.c = searchBarTitle;
        this.d = searchSource;
        this.e = screenSource;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = transitMode;
        this.j = str4;
        this.k = str5;
        this.l = universalPickerHeaderIcon;
    }
}
