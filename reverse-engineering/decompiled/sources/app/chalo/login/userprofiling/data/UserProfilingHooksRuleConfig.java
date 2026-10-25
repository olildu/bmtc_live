package app.chalo.login.userprofiling.data;

import defpackage.dn1;
import defpackage.hq0;
import defpackage.r30;
import defpackage.uf0;
import defpackage.xs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/login/userprofiling/data/UserProfilingHooksRuleConfig;", "", "Companion", "$serializer", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UserProfilingHooksRuleConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] i = {null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new dn1(24)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5368a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final List f;
    public final boolean g;
    public final long h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lapp/chalo/login/userprofiling/data/UserProfilingHooksRuleConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/login/userprofiling/data/UserProfilingHooksRuleConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "SESSIONS_VISIBLE_ALWAYS", "J", "VISIBLE_COUNT_IN_SESSION_ALWAYS", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UserProfilingHooksRuleConfig> serializer() {
            return UserProfilingHooksRuleConfig$$serializer.f5369a;
        }
    }

    public UserProfilingHooksRuleConfig(int i2, String str, boolean z, long j, long j2, long j3, List list, boolean z2, long j4) {
        this.f5368a = (i2 & 1) == 0 ? "" : str;
        if ((i2 & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i2 & 4) == 0) {
            this.c = 0L;
        } else {
            this.c = j;
        }
        if ((i2 & 8) == 0) {
            this.d = 0L;
        } else {
            this.d = j2;
        }
        if ((i2 & 16) == 0) {
            this.e = 1L;
        } else {
            this.e = j3;
        }
        if ((i2 & 32) == 0) {
            this.f = EmptyList.f17557a;
        } else {
            this.f = list;
        }
        if ((i2 & 64) == 0) {
            this.g = false;
        } else {
            this.g = z2;
        }
        this.h = (i2 & 128) == 0 ? -1L : j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfilingHooksRuleConfig)) {
            return false;
        }
        UserProfilingHooksRuleConfig userProfilingHooksRuleConfig = (UserProfilingHooksRuleConfig) obj;
        return Intrinsics.d(this.f5368a, userProfilingHooksRuleConfig.f5368a) && this.b == userProfilingHooksRuleConfig.b && this.c == userProfilingHooksRuleConfig.c && this.d == userProfilingHooksRuleConfig.d && this.e == userProfilingHooksRuleConfig.e && Intrinsics.d(this.f, userProfilingHooksRuleConfig.f) && this.g == userProfilingHooksRuleConfig.g && this.h == userProfilingHooksRuleConfig.h;
    }

    public final int hashCode() {
        int iHashCode = this.f5368a.hashCode() * 31;
        int i2 = this.b ? 1231 : 1237;
        long j = this.c;
        int i3 = (((iHashCode + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        int iB = (r30.b((i4 + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31, this.f) + (this.g ? 1231 : 1237)) * 31;
        long j4 = this.h;
        return iB + ((int) ((j4 >>> 32) ^ j4));
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("UserProfilingHooksRuleConfig(ruleId=", this.f5368a, ", enabled=", ", appSessionToDelay=", this.b);
        sbM.append(this.c);
        xs.r(this.d, ", loginSessionsToDelay=", ", sessionsVisible=", sbM);
        sbM.append(this.e);
        sbM.append(", cooldown=");
        sbM.append(this.f);
        sbM.append(", loopCooldowns=");
        sbM.append(this.g);
        sbM.append(", visibleCountsInSession=");
        return uf0.m(this.h, ")", sbM);
    }
}
