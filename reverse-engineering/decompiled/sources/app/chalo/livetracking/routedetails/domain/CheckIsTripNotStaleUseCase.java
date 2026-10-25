package app.chalo.livetracking.routedetails.domain;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.contract.BasicInfoContract;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/domain/CheckIsTripNotStaleUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckIsTripNotStaleUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicInfoContract f4428a;
    public final ChaloBuildConfig b;

    public CheckIsTripNotStaleUseCase(BasicInfoContract basicInfoContract, ChaloBuildConfig chaloBuildConfig) {
        this.f4428a = basicInfoContract;
        this.b = chaloBuildConfig;
    }

    public final boolean a(long j, int i, long j2, boolean z) {
        return (!z || j2 < ((long) i)) && ((int) ((this.f4428a.j() - j) / ((long) 1000))) < 900;
    }
}
