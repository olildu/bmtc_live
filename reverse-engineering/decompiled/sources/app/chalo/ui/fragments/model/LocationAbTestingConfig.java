package app.chalo.ui.fragments.model;

import defpackage.b3;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.t10;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ui/fragments/model/LocationAbTestingConfig;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class LocationAbTestingConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9749a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final int g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ui/fragments/model/LocationAbTestingConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ui/fragments/model/LocationAbTestingConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<LocationAbTestingConfig> serializer() {
            return LocationAbTestingConfig$$serializer.f9750a;
        }
    }

    public LocationAbTestingConfig() {
        this.f9749a = "";
        this.b = -1;
        this.c = -1;
        this.d = "";
        this.e = "";
        this.f = false;
        this.g = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationAbTestingConfig)) {
            return false;
        }
        LocationAbTestingConfig locationAbTestingConfig = (LocationAbTestingConfig) obj;
        return Intrinsics.d(this.f9749a, locationAbTestingConfig.f9749a) && this.b == locationAbTestingConfig.b && this.c == locationAbTestingConfig.c && Intrinsics.d(this.d, locationAbTestingConfig.d) && Intrinsics.d(this.e, locationAbTestingConfig.e) && this.f == locationAbTestingConfig.f && this.g == locationAbTestingConfig.g;
    }

    public final int hashCode() {
        return ((nf1.e(nf1.e(((((this.f9749a.hashCode() * 31) + this.b) * 31) + this.c) * 31, 31, this.d), 31, this.e) + (this.f ? 1231 : 1237)) * 31) + this.g;
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "LocationAbTestingConfig(cityName=", this.f9749a, ", minAppVer=", ", maxAppVer=");
        pk0.t(this.c, ", expId=", this.d, ", expName=", sbM);
        t10.s(this.e, ", isExpEnabled=", ", enabledPercentage=", sbM, this.f);
        return b3.f(")", this.g, sbM);
    }

    public /* synthetic */ LocationAbTestingConfig(int i, String str, int i2, int i3, String str2, String str3, boolean z, int i4) {
        if ((i & 1) == 0) {
            this.f9749a = "";
        } else {
            this.f9749a = str;
        }
        if ((i & 2) == 0) {
            this.b = -1;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = -1;
        } else {
            this.c = i3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i & 64) == 0) {
            this.g = -1;
        } else {
            this.g = i4;
        }
    }
}
