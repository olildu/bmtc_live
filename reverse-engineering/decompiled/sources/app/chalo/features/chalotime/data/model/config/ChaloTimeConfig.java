package app.chalo.features.chalotime.data.model.config;

import com.adjust.sdk.Constants;
import defpackage.vo1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/features/chalotime/data/model/config/ChaloTimeConfig;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloTimeConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2675a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lapp/chalo/features/chalotime/data/model/config/ChaloTimeConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/features/chalotime/data/model/config/ChaloTimeConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "DEFAULT_REFERENCE_URI_PATH", "Ljava/lang/String;", "", "DEFAULT_REQUEST_DELAY", "J", "", "DEFAULT_MAX_REQUEST_RETRY_COUNT", "I", "DEFAULT_REQUEST_TIMEOUT", "DEFAULT_EQUALITY_BUFFER", "DEFAULT_CACHE_EXPIRY_DURATION", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloTimeConfig> serializer() {
            return ChaloTimeConfig$$serializer.f2676a;
        }
    }

    public ChaloTimeConfig() {
        this.f2675a = 500L;
        this.b = 5;
        this.c = Constants.CONNECTION_TIMEOUT_VERIFY;
        this.d = 20000L;
        this.e = 259200000L;
        this.f = "configuration/chalo-props/v1";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloTimeConfig)) {
            return false;
        }
        ChaloTimeConfig chaloTimeConfig = (ChaloTimeConfig) obj;
        return this.f2675a == chaloTimeConfig.f2675a && this.b == chaloTimeConfig.b && this.c == chaloTimeConfig.c && this.d == chaloTimeConfig.d && this.e == chaloTimeConfig.e && Intrinsics.d(this.f, chaloTimeConfig.f);
    }

    public final int hashCode() {
        long j = this.f2675a;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + this.b) * 31) + this.c) * 31;
        long j2 = this.d;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        return this.f.hashCode() + ((i2 + ((int) ((j3 >>> 32) ^ j3))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChaloTimeConfig(requestDelay=");
        sb.append(this.f2675a);
        sb.append(", maxRequestRetryCount=");
        sb.append(this.b);
        sb.append(", requestTimeout=");
        sb.append(this.c);
        sb.append(", equalityBuffer=");
        sb.append(this.d);
        xs.r(this.e, ", cacheExpiryDuration=", ", chaloTimeUriPath=", sb);
        return vo1.p(sb, this.f, ")");
    }

    public /* synthetic */ ChaloTimeConfig(int i, long j, int i2, int i3, long j2, long j3, String str) {
        this.f2675a = (i & 1) == 0 ? 500L : j;
        if ((i & 2) == 0) {
            this.b = 5;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = Constants.CONNECTION_TIMEOUT_VERIFY;
        } else {
            this.c = i3;
        }
        if ((i & 8) == 0) {
            this.d = 20000L;
        } else {
            this.d = j2;
        }
        if ((i & 16) == 0) {
            this.e = 259200000L;
        } else {
            this.e = j3;
        }
        if ((i & 32) == 0) {
            this.f = "configuration/chalo-props/v1";
        } else {
            this.f = str;
        }
    }
}
