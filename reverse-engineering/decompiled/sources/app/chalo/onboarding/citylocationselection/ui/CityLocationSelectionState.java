package app.chalo.onboarding.citylocationselection.ui;

import app.chalo.behaviour.policy.CityAutoSelectionApplicable;
import defpackage.b3;
import defpackage.cb0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionState;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CityLocationSelectionState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6599a;
    public final CityLocationSelectionSource b;
    public final CityLocationSelectionLayoutType c;
    public final String d;
    public final String e;
    public final String f;
    public final WelcomeScreenConfig g;
    public final boolean h;
    public final boolean i;
    public final CityAutoSelectionApplicable j;
    public final boolean k;
    public final boolean l;

    public CityLocationSelectionState(boolean z, CityLocationSelectionSource source, CityLocationSelectionLayoutType layoutType, String str, String str2, String str3, WelcomeScreenConfig welcomeScreenConfig, boolean z2, boolean z3, CityAutoSelectionApplicable cityAutoSelectionApplicable, boolean z4) {
        Intrinsics.i(source, "source");
        Intrinsics.i(layoutType, "layoutType");
        this.f6599a = z;
        this.b = source;
        this.c = layoutType;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = welcomeScreenConfig;
        this.h = z2;
        this.i = z3;
        this.j = cityAutoSelectionApplicable;
        this.k = z4;
        this.l = cityAutoSelectionApplicable instanceof CityAutoSelectionApplicable.Yes;
    }

    public static CityLocationSelectionState a(CityLocationSelectionState cityLocationSelectionState, boolean z, CityLocationSelectionSource cityLocationSelectionSource, CityLocationSelectionLayoutType cityLocationSelectionLayoutType, String str, String str2, String str3, WelcomeScreenConfig welcomeScreenConfig, boolean z2, CityAutoSelectionApplicable cityAutoSelectionApplicable, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = cityLocationSelectionState.f6599a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            cityLocationSelectionSource = cityLocationSelectionState.b;
        }
        CityLocationSelectionSource source = cityLocationSelectionSource;
        if ((i & 4) != 0) {
            cityLocationSelectionLayoutType = cityLocationSelectionState.c;
        }
        CityLocationSelectionLayoutType layoutType = cityLocationSelectionLayoutType;
        String str4 = (i & 8) != 0 ? cityLocationSelectionState.d : str;
        String str5 = (i & 16) != 0 ? cityLocationSelectionState.e : str2;
        String str6 = (i & 32) != 0 ? cityLocationSelectionState.f : str3;
        WelcomeScreenConfig welcomeScreenConfig2 = (i & 64) != 0 ? cityLocationSelectionState.g : welcomeScreenConfig;
        boolean z5 = (i & 128) != 0 ? cityLocationSelectionState.h : z2;
        boolean z6 = (i & 256) != 0 ? cityLocationSelectionState.i : true;
        CityAutoSelectionApplicable autoSelectCityApplicability = (i & 512) != 0 ? cityLocationSelectionState.j : cityAutoSelectionApplicable;
        boolean z7 = (i & 1024) != 0 ? cityLocationSelectionState.k : z3;
        cityLocationSelectionState.getClass();
        Intrinsics.i(source, "source");
        Intrinsics.i(layoutType, "layoutType");
        Intrinsics.i(welcomeScreenConfig2, "welcomeScreenConfig");
        Intrinsics.i(autoSelectCityApplicability, "autoSelectCityApplicability");
        return new CityLocationSelectionState(z4, source, layoutType, str4, str5, str6, welcomeScreenConfig2, z5, z6, autoSelectCityApplicability, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CityLocationSelectionState)) {
            return false;
        }
        CityLocationSelectionState cityLocationSelectionState = (CityLocationSelectionState) obj;
        return this.f6599a == cityLocationSelectionState.f6599a && this.b == cityLocationSelectionState.b && this.c == cityLocationSelectionState.c && Intrinsics.d(this.d, cityLocationSelectionState.d) && Intrinsics.d(this.e, cityLocationSelectionState.e) && Intrinsics.d(this.f, cityLocationSelectionState.f) && Intrinsics.d(this.g, cityLocationSelectionState.g) && this.h == cityLocationSelectionState.h && this.i == cityLocationSelectionState.i && Intrinsics.d(this.j, cityLocationSelectionState.j) && this.k == cityLocationSelectionState.k;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + ((this.f6599a ? 1231 : 1237) * 31)) * 31)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return ((this.j.hashCode() + ((((((this.g.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237)) * 31)) * 31) + (this.k ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CityLocationSelectionState(showLoadingDialog=");
        sb.append(this.f6599a);
        sb.append(", source=");
        sb.append(this.b);
        sb.append(", layoutType=");
        sb.append(this.c);
        sb.append(", selectedCityId=");
        sb.append(this.d);
        sb.append(", selectedCityName=");
        cb0.t(sb, this.e, ", selectedCityDescription=", this.f, ", welcomeScreenConfig=");
        sb.append(this.g);
        sb.append(", showLocationSettingsDialog=");
        sb.append(this.h);
        sb.append(", startPlayingLocationAnimation=");
        sb.append(this.i);
        sb.append(", autoSelectCityApplicability=");
        sb.append(this.j);
        sb.append(", hideCurrentCitySelectionItem=");
        return b3.g(")", sb, this.k);
    }

    public /* synthetic */ CityLocationSelectionState(CityLocationSelectionLayoutType cityLocationSelectionLayoutType, int i) {
        this(false, CityLocationSelectionSource.Unknown, (i & 4) != 0 ? CityLocationSelectionLayoutType.None : cityLocationSelectionLayoutType, null, (i & 16) != 0 ? null : "Mumbai", (i & 32) != 0 ? null : "The city that never sleeps, The city that never sleeps, The city that never sleeps, The city that never sleeps, The city that never sleeps", new WelcomeScreenConfig(null, null, null, 7), false, false, CityAutoSelectionApplicable.No.f999a, false);
    }
}
