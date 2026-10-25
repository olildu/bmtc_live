package app.chalo.utils.resources;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/utils/resources/RemoteResourcesUrlConfig;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RemoteResourcesUrlConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10449a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/utils/resources/RemoteResourcesUrlConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/utils/resources/RemoteResourcesUrlConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RemoteResourcesUrlConfig> serializer() {
            return RemoteResourcesUrlConfig$$serializer.f10450a;
        }
    }

    public /* synthetic */ RemoteResourcesUrlConfig(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        if ((i & 1) == 0) {
            this.f10449a = "";
        } else {
            this.f10449a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteResourcesUrlConfig)) {
            return false;
        }
        RemoteResourcesUrlConfig remoteResourcesUrlConfig = (RemoteResourcesUrlConfig) obj;
        return Intrinsics.d(this.f10449a, remoteResourcesUrlConfig.f10449a) && Intrinsics.d(this.b, remoteResourcesUrlConfig.b) && Intrinsics.d(this.c, remoteResourcesUrlConfig.c) && Intrinsics.d(this.d, remoteResourcesUrlConfig.d) && Intrinsics.d(this.e, remoteResourcesUrlConfig.e) && Intrinsics.d(this.f, remoteResourcesUrlConfig.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e(this.f10449a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RemoteResourcesUrlConfig(bleTutorialGif=", this.f10449a, ", bleValidationGif=", this.b, ", bleOnboardingTutorialGif=");
        cb0.t(sbE, this.c, ", blePermissionTutorialGif=", this.d, ", tapInInfoGif=");
        return r30.i(sbE, this.e, ", tapOutInfoGif=", this.f, ")");
    }

    public RemoteResourcesUrlConfig(String str, String str2, String bleOnboardingTutorialGif, String str3, String tapInInfoGif, String tapOutInfoGif) {
        Intrinsics.i(bleOnboardingTutorialGif, "bleOnboardingTutorialGif");
        Intrinsics.i(tapInInfoGif, "tapInInfoGif");
        Intrinsics.i(tapOutInfoGif, "tapOutInfoGif");
        this.f10449a = str;
        this.b = str2;
        this.c = bleOnboardingTutorialGif;
        this.d = str3;
        this.e = tapInInfoGif;
        this.f = tapOutInfoGif;
    }

    public /* synthetic */ RemoteResourcesUrlConfig() {
        this("", "", "", "", "", "");
    }
}
