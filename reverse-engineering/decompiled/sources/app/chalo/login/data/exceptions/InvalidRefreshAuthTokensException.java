package app.chalo.login.data.exceptions;

import app.chalo.login.data.models.response.RefreshTokensResponseApiModel;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/login/data/exceptions/InvalidRefreshAuthTokensException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lapp/chalo/login/data/models/response/RefreshTokensResponseApiModel;", "refreshTokensResponseApiModel", "Lapp/chalo/login/data/models/response/RefreshTokensResponseApiModel;", "getRefreshTokensResponseApiModel", "()Lapp/chalo/login/data/models/response/RefreshTokensResponseApiModel;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InvalidRefreshAuthTokensException extends Exception {
    private final RefreshTokensResponseApiModel refreshTokensResponseApiModel;

    public InvalidRefreshAuthTokensException(RefreshTokensResponseApiModel refreshTokensResponseApiModel) {
        super("refresh token / access token is either null or empty");
        this.refreshTokensResponseApiModel = refreshTokensResponseApiModel;
    }
}
