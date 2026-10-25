package app.chalo.data;

import defpackage.uf0;
import defpackage.xs;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/PremiumBusCityWisePollingConfigAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumBusCityWisePollingConfigAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2376a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lapp/chalo/data/PremiumBusCityWisePollingConfigAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/PremiumBusCityWisePollingConfigAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "DEFAULT_FREQUENCY_DIFF_FACTOR", "F", "", "DEFAULT_MIN_THRESHOLD", "J", "DEFAULT_RUNNING_LATE_STATUS_THRESHOLD", "DEFAULT_ON_TIME_BUFFER_THRESHOLD", "DEFAULT_BUS_ARRIVED_EARLY_THRESHOLD", "DEFAULT_DELAYED_ETA_THRESHOLD_IN_MINS", "DEFAULT_TRACKING_ALLOWED_START_WINDOW_IN_MILLIS", "DEFAULT_SYSTEM_RESCHEDULE_ACK_BUFFER_IN_MILLIS", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusCityWisePollingConfigAppModel> serializer() {
            return PremiumBusCityWisePollingConfigAppModel$$serializer.f2377a;
        }
    }

    public PremiumBusCityWisePollingConfigAppModel() {
        this.f2376a = 0.25f;
        this.b = 120000L;
        this.c = 360L;
        this.d = 300L;
        this.e = 300L;
        this.f = 2L;
        this.g = 1800000L;
        this.h = 300000L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusCityWisePollingConfigAppModel)) {
            return false;
        }
        PremiumBusCityWisePollingConfigAppModel premiumBusCityWisePollingConfigAppModel = (PremiumBusCityWisePollingConfigAppModel) obj;
        return Float.compare(this.f2376a, premiumBusCityWisePollingConfigAppModel.f2376a) == 0 && this.b == premiumBusCityWisePollingConfigAppModel.b && this.c == premiumBusCityWisePollingConfigAppModel.c && this.d == premiumBusCityWisePollingConfigAppModel.d && this.e == premiumBusCityWisePollingConfigAppModel.e && this.f == premiumBusCityWisePollingConfigAppModel.f && this.g == premiumBusCityWisePollingConfigAppModel.g && this.h == premiumBusCityWisePollingConfigAppModel.h;
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.f2376a) * 31;
        long j = this.b;
        int i = (iFloatToIntBits + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.d;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.e;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.g;
        int i6 = (i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.h;
        return i6 + ((int) (j7 ^ (j7 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumBusCityWisePollingConfigAppModel(pollingFrequencyDiffFactor=");
        sb.append(this.f2376a);
        sb.append(", pollingFrequencyMinThreshold=");
        sb.append(this.b);
        xs.r(this.c, ", runningLateStatusThresholdInSec=", ", onTimeBufferThresholdInSec=", sb);
        sb.append(this.d);
        xs.r(this.e, ", busArrivedEarlyThresholdInSec=", ", delayedEtaThresholdInMins=", sb);
        sb.append(this.f);
        xs.r(this.g, ", trackingAllowedStartWindowInMillis=", ", systemRescheduleAckBufferInMillis=", sb);
        return uf0.m(this.h, ")", sb);
    }

    public /* synthetic */ PremiumBusCityWisePollingConfigAppModel(int i, float f, long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f2376a = (i & 1) == 0 ? 0.25f : f;
        if ((i & 2) == 0) {
            this.b = 120000L;
        } else {
            this.b = j;
        }
        if ((i & 4) == 0) {
            this.c = 360L;
        } else {
            this.c = j2;
        }
        if ((i & 8) == 0) {
            this.d = 300L;
        } else {
            this.d = j3;
        }
        if ((i & 16) == 0) {
            this.e = 300L;
        } else {
            this.e = j4;
        }
        if ((i & 32) == 0) {
            this.f = 2L;
        } else {
            this.f = j5;
        }
        if ((i & 64) == 0) {
            this.g = 1800000L;
        } else {
            this.g = j6;
        }
        this.h = (i & 128) == 0 ? 300000L : j7;
    }
}
