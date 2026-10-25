package app.chalo.ncmc.utils;

import app.chalo.network.config.ChaloJson;
import defpackage.g0;
import defpackage.we;
import kotlin.Metadata;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CardsJsonKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Json f6442a;

    static {
        ChaloJson chaloJson = ChaloJson.f6455a;
        f6442a = JsonKt.a(Json.d, new g0(new we(8), 25));
    }
}
